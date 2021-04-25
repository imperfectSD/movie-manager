package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
  private int filmsAdded = 10;

  public MovieManager() {
  }

  public MovieManager(int filmsAdded) {
    this.filmsAdded = filmsAdded;
  }

  private MovieItem[] items = new MovieItem[0];

  public void add(MovieItem item) {
    int length = items.length + 1;
    MovieItem[] tmp = new MovieItem[length];
    for (int i = 0; i < items.length; i++) {
      tmp[i] = items[i];
    }
    tmp[length - 1] = item;
    items = tmp;
  }

  public MovieItem[] getLastAdded() {
    int moviesDisplayed = filmsAdded;
    if (moviesDisplayed >= items.length)
      moviesDisplayed = items.length;
    MovieItem[] result = new MovieItem[moviesDisplayed];
    int index = 0;
    for (int i = items.length - 1; i >= 0 && index < moviesDisplayed; i--) {
      result[index] = items[i];
      index++;
    }
    return result;
  }
}
