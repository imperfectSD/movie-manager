package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

  @Test
  public void shouldBeTenMovies() {
    MovieManager manager = new MovieManager();
    MovieItem first = new MovieItem(1, 1, "first");
    MovieItem second = new MovieItem(2, 2, "second");
    MovieItem third = new MovieItem(3, 3, "third");
    MovieItem fourth = new MovieItem(4, 4, "fourth");
    MovieItem fifth = new MovieItem(5, 5, "fifth");
    MovieItem sixth = new MovieItem(6, 6, "sixth");
    MovieItem seventh = new MovieItem(7, 7, "seventh");
    MovieItem eighth = new MovieItem(8, 8, "eighth");
    MovieItem ninth = new MovieItem(9, 9, "ninth");
    MovieItem tenth = new MovieItem(10, 10, "tenth");

    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(tenth);

    MovieItem[] actual = manager.getLastAdded();
    MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldBeMoreThenTenMovies() {
    MovieManager manager = new MovieManager();
    MovieItem first = new MovieItem(1, 1, "first");
    MovieItem second = new MovieItem(2, 2, "second");
    MovieItem third = new MovieItem(3, 3, "third");
    MovieItem fourth = new MovieItem(4, 4, "fourth");
    MovieItem fifth = new MovieItem(5, 5, "fifth");
    MovieItem sixth = new MovieItem(6, 6, "sixth");
    MovieItem seventh = new MovieItem(7, 7, "seventh");
    MovieItem eighth = new MovieItem(8, 8, "eighth");
    MovieItem ninth = new MovieItem(9, 9, "ninth");
    MovieItem tenth = new MovieItem(10, 10, "tenth");
    MovieItem eleventh = new MovieItem(11, 11, "eleventh");

    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(tenth);
    manager.add(eleventh);

    MovieItem[] actual = manager.getLastAdded();
    MovieItem[] expected = new MovieItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldBeLessThenTenMovies() {
    MovieManager manager = new MovieManager();
    MovieItem first = new MovieItem(1, 1, "first");
    MovieItem second = new MovieItem(2, 2, "second");
    MovieItem third = new MovieItem(3, 3, "third");
    MovieItem fourth = new MovieItem(4, 4, "fourth");
    MovieItem fifth = new MovieItem(5, 5, "fifth");

    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);

    MovieItem[] actual = manager.getLastAdded();
    MovieItem[] expected = new MovieItem[]{fifth, fourth, third, second, first};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldNullArray() {
    MovieManager manager = new MovieManager();

    MovieItem[] actual = manager.getLastAdded();
    MovieItem[] expected = new MovieItem[0];
    assertArrayEquals(expected, actual);
  }

}