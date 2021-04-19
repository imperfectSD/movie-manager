package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
  private MovieItem[] items = new MovieItem[0];
  private int filmsAdded = 10;

  public MovieManager() {
  }

  public MovieManager(int filmsAdded) {
    this.filmsAdded = filmsAdded;
  }

  public void add(MovieItem item) {
    int length = items.length + 1;
    MovieItem[] tmp = new MovieItem[length];
    System.arraycopy(items, 0, tmp, 0, items.length);
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    items = tmp;
  }

  public MovieItem[] getLastAdded() {
    MovieItem[] result = new MovieItem[items.length];
    for (int i = 0; i < result.length; i++) {
      int index = items.length - i - 1;
      result[i] = items[index];
    }
    return result;
  }

}
