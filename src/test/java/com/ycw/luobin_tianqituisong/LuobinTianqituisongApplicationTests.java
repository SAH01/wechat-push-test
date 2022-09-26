package com.ycw.luobin_tianqituisong;

import com.ycw.controller.Pusher;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LuobinTianqituisongApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void goodMorning(){
        Pusher.push();
    }
}
