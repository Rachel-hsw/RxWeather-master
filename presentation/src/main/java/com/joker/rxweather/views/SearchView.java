package com.joker.rxweather.views;

/**
 * Created by Joker on 2015/11/4.
 */
public interface SearchView<T> extends LoadingView, ContentView {

  void showSearchResult(T t);
}
