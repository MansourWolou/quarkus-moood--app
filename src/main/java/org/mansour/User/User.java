package org.mansour.User;


import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class User extends PanacheEntity {
    public String name;
    public String mail;
    public String pwd;
    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "userTableId",referencedColumnName = "user_id" )
    //private List<ContentModel> content;
}
