import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.file;

public class Musik{
  public static syncronized void music (String track){
    final String trackname = track;

  
  new Thread(new Runnable(){
    
    @Override
    public void run(){
      
      while (true){
        
        try{
          
          Clip clip = AudioSystem.getClip();
          AudioInputStream inputstream = AudioSystem.getAudioInputStream(newFile(trackname));
          clip.open(inputstream);
            clip.loop(clip.LOOP.CONTINUOUSLY);
          }catch(Exeptione){
            
            e.printStackTrace();
            }
            }}
            }).start();}}
      
  
  