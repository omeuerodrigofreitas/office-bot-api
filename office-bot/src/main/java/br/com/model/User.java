package br.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class User {

    @Id
    private UUID uuid = UUID.randomUUID();
}
