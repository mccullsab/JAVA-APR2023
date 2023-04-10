package com.heidichen.sessionformsdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	// -----------SESSIONS-------------
	@GetMapping("/sessions/home")
	public String setSessionHome(HttpSession session) {
		// 1. if count is not available , set count to 0
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);			
		}else {
			// 2. get the count from session
			Integer count = (Integer) session.getAttribute("count");
			// 3. count = count +1 and reset in session
			session.setAttribute("count", count+1);
			
		}
		return "sessions/home.jsp";
	}
	
	@GetMapping("/sessions/display")
	public String displaySession() {
		return "sessions/displaySession.jsp";
	}
	
	// -----------SEARCH FORM (GET)-------------
	// Render the form jsp
	@GetMapping("/search/form")
	public String renderSearchForm() {
		return "searchForm/searchForm.jsp";
	}
	
	//http://localhost:8080/search/result?keyword=cats
	// process & display the form information
	@GetMapping("/search/result")
	public String displaySearchResult(@RequestParam("keyword")String keywordFromParams, HttpSession session ) {
		session.setAttribute("keyword", keywordFromParams);
		return "searchForm/displaySearchResult.jsp";
	}
	
	

	// -----------REVIEW FORM (POST)-------------
	// Render the form
	@GetMapping("/review/form")
	public String renderReviewForm() {
		return "reviewForm/reviewForm.jsp";
	}
	
	// process the form
	@PostMapping("/review/process")
	public String displayReviewResult(
			@RequestParam("title") String title,
			@RequestParam("reviewer")String reviewer,
			@RequestParam("rating") Integer rating,
			@RequestParam("description") String description,
			HttpSession session
			) {
		session.setAttribute("title", title);
		session.setAttribute("reviewer", reviewer);
		session.setAttribute("rating", rating);
		session.setAttribute("description", description);
		return "redirect:/review/result";
	}
	
	// display the result
	@GetMapping("/review/result")
	public String displayReviewResult() {
		return "reviewForm/displayReviewResult.jsp";
	}
	

}













