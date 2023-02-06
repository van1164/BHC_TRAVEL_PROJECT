package com.BHC.TRAVEL.HYEN_SHAN.USER.MODEL;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "USER")
public class USER {
    @Id
    private int useridx;
    private String ID;
    private String password;
    private String nickname;

    @Builder
    public USER(String ID, String password, String nickname){
        this.ID = ID;
        this.password = password;
        this.nickname = nickname;
    }
}
