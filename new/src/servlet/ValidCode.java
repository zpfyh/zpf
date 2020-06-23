package servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ValidCode
 */
public class ValidCode extends HttpServlet {
	
private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* ********������֤��************** */
		//request�������   ��Ҫ
		//response��Ӧ����  ��Ҫ
		
		//��ͻ�����������͵���ͼƬ��Ĭ����text/html.����ҳ
		response.setContentType("images/jpeg");
		
		//�ڷ��������ڴ�������һ��ͼƬ
		BufferedImage image =new BufferedImage(75, 30,BufferedImage.TYPE_INT_RGB);
		
		//����һ�����ʣ��û��ʿ�����image�����ϻ�ͼ
		Graphics g = image.getGraphics();
		
		//���ñʵ���ɫΪ����ɫ��Ȼ����䱳��
		g.setColor(new Color(230,230,230));
		g.fillRect(0, 0, 75, 30);
		g.setColor(new Color(150, 150, 150));
		g.drawRect(0, 0, 74, 29);

		//��������
		g.setColor(Color.blue);
		for (int i = 0; i < 5; i++) {
			int x1 = new Random().nextInt(30);
			int x2 = new Random().nextInt(75);
			int y1 = new Random().nextInt(10);
			int y2 = new Random().nextInt(29);
			g.drawLine(x1,y1 , x2, y2);
		}
		
		//���ñʵ���ɫΪ��ɫ��Ȼ����֤��
		g.setColor(Color.black);
		
		Font font =new Font("Arial", 1 ,18);
		g.setFont(font);
		
		//���÷�����ȡ��֤��aX
		String validcode = generateValidCode();
		//����֤��ص�image��  abc
		for (int i = 0; i < validcode.length(); i++) {
			g.drawString(String.valueOf( validcode.charAt(i)), 5+i*15, 21+(i%2*2));
		}
		

		
		//����֤�뱣�浽session��
		request.getSession().setAttribute("validcode",validcode);
		
		//����֤��ͼƬ���浽�����
		ImageIO.write(image, "jpeg", response.getOutputStream());
		
		//�ͷŻ��ʣ������´λ�ȡ��֤��ʱ����֤��ͼ����һ�εĻ���ռ��
		g.dispose();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	/**
	 * ������֤��
	 * */
	private String generateValidCode(){
		StringBuffer buffer =new StringBuffer();
		for (int i = 0; i < 2; i++) {
			//����һ��Сд��ĸ
			buffer.append((char)(new Random().nextInt(26)+ 97));
			//����һ������
			buffer.append((char)(new Random().nextInt(10)+ 48));
		}
		return buffer.toString();
	}


}
