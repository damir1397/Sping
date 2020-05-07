package kg.damir.sweater.models;

import javax.persistence.*;

@Entity
@Table(name = "Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private Long id;
    @Column(name = "_title")
    private String title;
    @Column(name = "_anons")
    private String anons;
    @Column(name = "_fulltext")
    private String fulltext;
    @Column(name = "_views")
    private int views;

    public Post() { }

    public Post(String title, String anons, String fulltext) {
        this.title = title;
        this.anons = anons;
        this.fulltext = fulltext;
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

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
