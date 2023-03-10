package com.prec.bean;


public class ManagerPage {
	int startNo;    // 목록의 시작 위치
	int endNo;      // 목록의 끝 위치
	int listSize=10;   // 목록의 행수
	int totSize;    // 검색된 전체 건수
	int blockSize=7;  // 표시될 페이지의 수
	int totPage;    // 전체 페이지 수
	int startPage;  // 페이지의 시작 위치
	int endPage;    // 페이지의 끝 위치
	int nowPage=1;    // 사용자가 보고있는 현재 페이지
	String findStr; //
	
	
	String fO;
	String fW;
	String listAlign;
	
	public ManagerPage() {
		compute();
	}
	public ManagerPage(int totSize, int nowPage) {
		this.totSize = totSize;
		this.nowPage = nowPage;
		compute();
	}
	public void compute() {
		totPage = (int)Math.ceil(totSize/(double)listSize);
		endNo = listSize*nowPage;
		startNo = endNo-listSize;
		if(endNo>totSize) endNo = totSize;
		
		endPage = (int)Math.ceil(nowPage/(double)blockSize)*blockSize;
		startPage = endPage-blockSize+1;
		if(endPage > totPage) endPage = totPage;
	}
	/*
	public static void main(String[] args) {
		Page p = new Page();
		p.setTotSize(450);
		p.setNowPage(9);
		p.compute();
		System.out.println("totPage : " + p.getTotPage());
		System.out.println("startNo : " + p.getStartNo());
		System.out.println("endNo : " + p.getEndNo());
		System.out.println("startPage : " + p.getStartPage());
		System.out.println("endPage : " + p.getEndPage());
	}
	*/
	// getter & setter 
	
	public int getStartNo() {
		return startNo;
	}
	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}
	public int getEndNo() {
		return endNo;
	}
	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	public int getTotSize() {
		return totSize;
	}
	public void setTotSize(int totSize) {
		this.totSize = totSize;
	}
	public int getBlockSize() {
		return blockSize;
	}
	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}
	public int getTotPage() {
		return totPage;
	}
	public void setTotPage(int totPage) {
		this.totPage = totPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public String getFindStr() {
		return findStr;
	}
	public void setFindStr(String findStr) {
		this.findStr = findStr;
	}
	
	
	//--------------------------
	
	
	public String getfO() {
		return fO;
	}
	public void setfO(String fO) {
		this.fO = fO;
	}
	public String getfW() {
		return fW;
	}
	public void setfW(String fW) {
		this.fW = fW;
	}
	public String getListAlign() {
		return listAlign;
	}
	public void setListAlign(String listAlign) {
		this.listAlign = listAlign;
	}
	
	
}
