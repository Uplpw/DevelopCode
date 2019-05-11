package com.it.Agile.bean;

public class Page {
	private int currentPage;
	private int pageSize;      //一页的图片数量
	private int totalCount;
	private int totalPage;
	
	public Page() {
	}
	public Page(int currentPage, int pageSize, int totalCount, int totalPage) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		//计算出总页数
		this.totalPage=this.totalCount%this.pageSize==0?this.totalCount/this.pageSize:this.totalCount/this.pageSize+1;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	
//	public void setTotalPage(int totalPage) {
//		this.totalPage = totalPage;
//	}
}
