/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lenovo
 */
@Entity
public class Book implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY ) 
  private Long id;
  private String title;
  private String author;
  private String genre;
  private int year;
  private int price;
  private int quantity;
  private int count; 

    public Book() {
    }

    public Book(String title, String author, String genre, int year, int price, int quantity) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
        this.count = this.quantity;
    }

    

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", year=" + year + ", price=" + price + ", quantity=" + quantity + ", count=" + count + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.title);
        hash = 41 * hash + Objects.hashCode(this.author);
        hash = 41 * hash + Objects.hashCode(this.genre);
        hash = 41 * hash + this.year;
        hash = 41 * hash + this.price;
        hash = 41 * hash + this.quantity;
        hash = 41 * hash + this.count;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.count != other.count) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
  

    
 }

  

