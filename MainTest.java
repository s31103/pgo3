import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
  @org.junit.jupiter.api.Test
  void wyliczCenaCzwartek(){
    assertEquals(0,Main.calculatePrice(28,"Poznan","Czwartek"));
  }
  @org.junit.jupiter.api.Test
  void wyliczCenaDlaWarszawy(){
    assertEquals( 36,Main.calculatePrice(20,"Warszawa", "Piatek"));
  }
  @org.junit.jupiter.api.Test
  void wyliczCenaWiekMiedzy10a18(){
    assertEquals(20,Main.calculatePrice(16,"Wrocław","Sroda"));
  }

}