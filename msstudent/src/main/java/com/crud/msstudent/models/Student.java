 package com.crud.msstudent.models;

        import java.io.Serializable;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
        import lombok.Getter;
        import lombok.NoArgsConstructor;
        import lombok.Setter;
        import lombok.experimental.Accessors;
        
        @Getter
        @Setter
        @Accessors(chain=true)
        @NoArgsConstructor
        @AllArgsConstructor
        @Entity
    
        public class Student implements Serializable {
            private static final long serialVersionUID = 1L;
            @Id
            @GeneratedValue(strategy=GenerationType.IDENTITY)
            private int id;

            private String firstname;
         
            private String lastname;
            @Column(nullable = true, name = "email")
            private String email;
        }