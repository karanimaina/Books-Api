package com.example.books.models;

public class Books {
    private Long id;
    private String name;
    private String mame;

    public Books(Long id, String name, String mame) {
        this.id = id;
        this.name = name;
        this.mame = mame;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }
}
