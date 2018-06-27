package com.example.administrator.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //------------------------------------------
        ListView MovieList = findViewById(R.id.MovieList);
        ArrayList<Movie> movie = new ArrayList<Movie>();

        //------------------------------------------
        movie.add(new Movie(R.mipmap.superman, "超人特攻隊2", "2018/06/27","故事設定在第一集結束後，民眾們對超級英雄的想法改觀，一連串的事件讓本來在家當家庭主婦的超能太太反而成為超級英雄代言人，四處奔走。超能先生則是在家當超級奶爸，雖然心有不甘，卻意外發現小兒子小杰超驚人的超能力，這次他們又會碰到甚麼挑戰呢?"));
        movie.add(new Movie(R.mipmap.bookshop,"街角的書店","2018/06/29","芙洛倫絲因為先生去世，決定為自己實現長久以來的夢想：開一間書店。最後來到英國濱海的寧靜小鎮哈博洛，展開她追逐夢想的新生活。芙洛倫絲買下了一間荒廢許久的破舊老屋，經營起鎮上唯一的書店。"));
        movie.add(new Movie(R.mipmap.summer,"夏日1993","2018/06/29","★ 代表西班牙角逐2018奧斯卡最佳外語片" + "★ 2018 西班牙「高第獎」最佳加泰隆尼亞語影片、最佳導演、最佳劇本、最佳女配角、最佳剪輯 五項大獎" +"★ 2018 西班牙奧斯卡「哥雅獎」最佳新晉導演、最佳男配角、最佳新晉女演員"));
        movie.add(new Movie(R.mipmap.hades,"鋼鐵墳墓2","2018/06/29","專門測試監獄安全的越獄專家雷布瑞林（席維斯史特龍 飾），為救出突然被綁架並入獄的好友任樹（黃曉明 飾），潛入世界上最滴水不漏的高科技監獄，這座監獄不僅是全電腦控制，空間更會隨意變形，雷遇到史上最強的"));
        movie.add(new Movie(R.mipmap.bee,"蟻人與黃蜂女","2018/07/04","故事接續在《美國隊長3：英雄內戰》之後，史考特朗恩因為參與了內戰判刑，帶上電子腳鐐，居家監禁，在父親和蟻人兩個角色中左支右絀。眼看刑期終於快服滿，皮姆博士和荷普又帶著危急的任務找上門，史考特不得不再次穿上蟻人裝束，與黃蜂女一起對抗來自過去的黑暗秘密。"));
        movie.add(new Movie(R.mipmap.champion,"冠軍大叔","2018/06/15","在美國洛杉磯夜店工作的馬克（馬東石飾），一直夢想在腕力比賽中成為世界冠軍，被自認是他經紀人的晉基（權律飾）說服，回到韓國參加全國腕力大賽。"));

        //------------------------------------------
        MovieAdapter movieAdapter = new MovieAdapter(this,movie);
        MovieList.setAdapter(movieAdapter);
    }
}
