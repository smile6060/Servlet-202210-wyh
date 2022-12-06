package com.study.cookie;

import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie/2")
public class Cookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
/*		List<Cookie> cookieList = Arrays.asList(cookies);
 * 		리스트로도 사용할 수 있다.
 * 		쿠키는 무조건 String 값만 저장할 수 있다.
 */
		
		for(Cookie c : cookies) {
			System.out.println("key: " + c.getName());
			System.out.println("value: " + URLDecoder.decode(c.getValue(), StandardCharsets.UTF_8));
		}
	}

}
