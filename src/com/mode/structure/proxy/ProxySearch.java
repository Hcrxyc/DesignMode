package com.mode.structure.proxy;

/**
 * @Author admin
 * @Date 2022/3/10 16:24
 * @description
 */
public class ProxySearch implements Searcher{
    private RealSearch realSearch;

    public ProxySearch(RealSearch realSearch) {
        this.realSearch = realSearch;
    }

    @Override
    public void searcher() {
        System.out.println("身份验证");
        realSearch.searcher();
        System.out.println("记录操作日志");
    }

    public static void main(String[] args) {
        ProxySearch proxySearch = new ProxySearch(new RealSearch());
        proxySearch.searcher();
    }
}
