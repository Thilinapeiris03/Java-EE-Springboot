package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String batch;
    private String institute;

    public void setFirstName(String firstName) {
        if("".equalsIgnoreCase(firstName)) return;
        if(null==firstName) return;

        this.firstName = firstName;
    }


}
