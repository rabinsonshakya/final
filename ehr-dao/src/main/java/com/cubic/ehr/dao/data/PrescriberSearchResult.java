package com.cubic.ehr.dao.data;

import java.util.List;

public class PrescriberSearchResult {

	private List<PrescriberVO> searchResult;

	public PrescriberSearchResult() {
		// TODO Auto-generated constructor stub
	}

	public PrescriberSearchResult(List<PrescriberVO> searchResult) {
		super();
		this.searchResult = searchResult;
	}

	public List<PrescriberVO> getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(List<PrescriberVO> searchResult) {
		this.searchResult = searchResult;
	}

}
