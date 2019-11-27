package com.entity;

public class Pagination {
    private int pageNum = 1;//当前页码
    private int pageSize = 2;//每页记录数
    private int count = 0;//记录的总数

    public Pagination(int pageNum, int pageSize, int count) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.count = count;
    }

    public Pagination(){}

    //第一页
    public int getFirst(){
        return 1;
    }

    //总页数
    public int getPageCount(){
        return (int)Math.ceil(this.count*1.0/this.pageSize);
    }

    public int getLast(){
        return getPageCount();
    }

    public int getPrev(){
        return Math.max(this.pageNum - 1, 1);
    }

    public int getNext(){
        return Math.min(this.pageNum + 1, getPageCount());
    }

}
