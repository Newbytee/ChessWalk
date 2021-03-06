package Game;

import Game.entities.Player;

import java.awt.*;

abstract class UI {

    static void drawUI(Graphics g,Player player){
        g.setColor(Color.orange);
        g.fillRect(0,GameState.boardHeight,800,120);
        int hp = player.getHp();
        g.setColor(Color.red);
        g.fillRect(GameState.offsetX,2*GameState.offsetY+GameState.boardHeight,200,40);
        g.setColor(Color.green);
        g.fillRect(GameState.offsetX,2*GameState.offsetY+GameState.boardHeight,hp*4,40);
        for(int i=0;i<5;i++){
            g.setColor(Color.orange);
            if(i==GameState.selected) g.setColor(Color.yellow);
            g.fillRect(GameState.boardWidth/2+62*i,2*GameState.offsetY+GameState.boardHeight,GameState.tileSize+8,GameState.tileSize+8);
            g.setColor(Color.darkGray);
            g.fillRect(GameState.boardWidth/2+62*i+4,GameState.offsetY*2+GameState.boardHeight+4,GameState.tileSize,GameState.tileSize);
            player.items.get(i).draw(g,GameState.boardWidth/2+62*i+4,GameState.offsetY*2+GameState.boardHeight+4);
        }
    }
    static void UIPress(Point p){



    }
}
