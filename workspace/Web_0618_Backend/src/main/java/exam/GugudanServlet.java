//GugudanServlet.java

package exam;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 
 * [구구단 처리 서블릿]
 * 
 * 사용자가 입력한 기준 단(dan)과 출력 개수(limit)를 바탕으로
 * 
 * 화면에 표시할 시작 단(start)과 끝 단(end)을 계산하여 JSP로 전달하는 컨트롤러입니다.
 * 
 */

@WebServlet("/gugudanServlet")

public class GugudanServlet extends HttpServlet {

// 객체 직렬화(Serialization)를 위한 고유 버전 ID (클래스 구조 변경 시 검증용)

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * HTTP POST 요청을 처리하는 메서드입니다.
	 * 
	 * 폼(Form) 전송 데이터나 비동기 POST 요청이 들어오면 호출됩니다.
	 * 
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		setCorsHeaders(response); // 교차 출처 자원 공유(CORS) 문제를 방지하기 위해 응답 헤더 설정

		doProcess(request, response); // 실제 구구단 로직을 처리하는 공통 메서드로 실행 위임

	}

	/**
	 * 
	 * HTTP OPTIONS 요청을 처리하는 메서드입니다.
	 * 
	 * 브라우저가 실제 요청(POST 등)을 보내기 전, 서버의 권한을 확인하는 '예비 요청(Preflight)'을 처리합니다.
	 * 
	 */

	protected void doOptions(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		setCorsHeaders(response); // 예비 요청에도 CORS 승인 헤더가 반드시 필요함

		doProcess(request, response); // 공통 로직 실행 위임

	}

	/**
	 * 
	 * 모든 HTTP 메서드(POST, OPTIONS 등)의 비즈니스 로직을 통합 처리하는 공통 메서드입니다.
	 * 
	 */

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

// 1. 요청 파라미터 추출 및 데이터 타입 변환 (String -> int)

// 클라이언트가 보낸 문자열 데이터를 정수형(int)으로 형변환하여 변수에 저장합니다.

		int limit = Integer.parseInt(request.getParameter("limit")); // 화면에 보여줄 총 단의 개수 (범위 제한 값)

		int dan = Integer.parseInt(request.getParameter("dan")); // 사용자가 선택한 핵심 기준 단

// 2. 구구단 출력 범위 계산 알고리즘

// 기준 단(dan)을 중심으로 좌우 대칭이 되도록 시작 단과 끝 단을 산출합니다.

// 예: dan=5, limit=5 일 때 -> limit/2 = 2 이므로

// start = 5 - 2 = 3단 / end = 5 + 2 = 7단 -> 총 5개 단(3,4,5,6,7) 출력

		int start = dan - (limit / 2); // 시작할 구구단 번호 계산

		int end = dan + (limit / 2); // 끝날 구구단 번호 계산

// 3. JSP(뷰) 화면으로 전달할 데이터를 Request 영역에 저장 (수명: 1개의 HTTP 요청 안에서만 유효)

		request.setAttribute("dan", dan); // 사용자가 선택한 기준 단 저장

		request.setAttribute("start", start); // 계산된 시작 단 저장

		request.setAttribute("end", end); // 계산된 끝 단 저장

		request.setAttribute("color", request.getParameter("color")); // 사용자가 선택한 강조 배경색 스킨 저장

// 4. 서버 내부 포워딩 (Forward)

// 제어권을 보이지 않게 '/WEB-INF/views/gugudan.jsp'로 넘깁니다.

// 사용자의 브라우저 URL은 변경되지 않으며, 위에서 request에 담은 데이터들을 JSP에서 그대로 꺼내 쓸 수 있습니다.

// WEB-INF 폴더 내부에 jsp를 두어 사용자가 URL을 통해 JSP 파일에 직접 접근하는 것을 차단(보안)합니다.

		request.getRequestDispatcher("/WEB-INF/views/gugudan.jsp").forward(request, response);

	}

	/**
	 * 
	 * [CORS(Cross-Origin Resource Sharing) 헤더 설정 메서드]
	 * 
	 * 서로 다른 도메인이나 포트(예: React, Vue 등 다른 서버)에서 이 서블릿으로
	 * 
	 * API 요청을 보낼 때, 브라우저의 보안 정책으로 인해 차단되는 현상을 방지합니다.
	 * 
	 */

	private void setCorsHeaders(HttpServletResponse response) {

// 모든 도메인(*)에서의 접근을 허용합니다. (실무에서는 특정 도메인만 지정하는 것이 안전합니다)

		response.setHeader("Access-Control-Allow-Origin", "*");

// 허용할 HTTP 메서드 방식을 정의합니다. (조회용 GET, 데이터 전송용 POST, 예비 요청 OPTIONS)

		response.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS");

// 요청 본문(Body)에 포함될 수 있는 허용 헤더 타입을 지정합니다. (예: application/json 등)

		response.setHeader("Access-Control-Allow-Headers", "Content-Type");

	}

}