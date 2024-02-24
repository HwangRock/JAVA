package learn_gui;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class english extends JFrame {
	    int counter=0;
	    int score=0;
	    private JButton b1;
	    private Label problem,text,result,result2;
	    private JTextField answer;
	    
	    public String[] eng= {"abide", "incredulous", "onset", "shard", "pinpoint", "pliale", "clout", "constellation", "daunt", "vociferous", "nocturnal", "capricious", 
		"disseminate", "override", "pore", "stand for", "affront", "extraneous", "procurement", "jeer", "annihilate", "ferry", "stingy", "underway", "capitalize on", "owing to",
		"prevail", "scour", "tout", "expressly", "wield", "appreciable", "locale", "pitiful", "predicament", "coalsce", "devoid of", "extol", "heed", "affiliate","albeit",
		"apat form", "engaged", "exude", "inauspicious", "demise", "disinterested", "erdite", "impartial"};
	    //영어가 저장되는 곳

	    public String[] mean= {"견디가,살아가다", "의심많은", "시작", "파편", "정확한", "유연한", "권력", "배열" ,"압도하다", "시끄러운", "야행성의", "변덕스러운", "퍼지다", "압도하다", "응시하다", "나타내다",
	    		"모욕하다", "상관없는", "조달", "조롱하다", "전멸시키다", "수송하다", "인색한", "진행중인", "활용하다", "~때문에", "퍼지다,이기다", "찾다", "홍보하다", "명백히", "발휘하다","눈에 띄는", "위치", "불쌍한",
	    		"곤경", "합치다", "없는", "칭찬하다", "주의하다", "연합하다", "비록~일지라도", "제외하고", "바쁜", "흘리다", "불길한", "죽음", "객관적인", "학식있는", "공정한"};
	    //한글뜻이 저장되는 곳.
	    
	    public int[]n=new int[11];//문제 배열

	    public ArrayList<String> wrong=new ArrayList();//틀린 단어가 저장될 곳.
	    
	    public english() {
	    	for (int i=0; i<10; i++) {
				int num=(int)(Math.random()*eng.length);
				n[i]=num;
				
				
				for(int y=0; y<i; y++) {
					if (n[i]==n[y]) {
						i--;
						break;
					}
				}
			}
	    	class Listener implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					
					
					counter++;//문제 번호
					String submit=answer.getText();//내가 쓴 답
					String real=mean[n[counter-1]];//답
					problem.setText(eng[n[counter]]);//문제
					
					
					
					if (submit.equals(real)) {
						score+=1;//점수
					}
					else {
						wrong.add(eng[n[counter-1]]);//오답 배열에 추가.
					}
					
					
				
		            if (counter==10) {
		            	remove(b1);
		            	remove(text);
		            	remove(problem);
		            	remove(answer);
		            	add(result);
		            	add(result2);
		            	result.setText("Score: "+score);
		            	
		            	if (score==10) { //점수 별 감탄사.
		            		result2.setText("Perfect!");
		            	}
		            	else {
		            		if(score<=9 && score>=7){
		            			result2.setText("GOOD. Repeat this.");
			            	}
			            	else if(score<=6 && score>=4) {
			            		result2.setText("BAD. Repeat this.");
			            	
			            	}
			            	else {
			            		result2.setText("What the fuxx;; Repeat this;");
			            	}
		            		
		            		for (int f=0; f<wrong.size();f++) {
		            			
		            		}
		            		
		            		for (String y:wrong) {
		            			System.out.print(y+"  ");
		            		}
		            	}
		            	
		            }
		            
		            
				
					
				}
			}
			result=new Label();//결과창의 요소들.
			result.setLocation(40,40);
			result.setSize(70,30);
			
			result2=new Label();
			result2.setLocation(40,60);
			result2.setSize(230,30);
			
			
			
			
			
			
			
			setSize(400,300);
			setTitle("English Test");
			setLayout(null);
			
			b1=new JButton("Next");//시험창의 요소들.
			add(b1);
			b1.setLocation(165,200);
			b1.setSize(80,20);
			b1.addActionListener(new Listener());
			
			problem=new Label(eng[n[counter]]);
			problem.setLocation(40,40);
			problem.setSize(100,30);
			add(problem);
			
			text=new Label("Answer:");
			text.setLocation(40,55);
			text.setSize(50,45);
			add(text);
			
			
			answer = new JTextField(40);
			answer.setLocation(90,70);
			answer.setSize(150,20);
			answer.addActionListener(new Listener());
			add(answer);
			
			
			
		
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	}
	    

}

		
		






