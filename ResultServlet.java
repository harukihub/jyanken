

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public ResultServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/Result.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int[][] judge = {{0,1,2},//あなたの手
//				         {1,0,2},//
//				         {2,1,0}};//
		//ユーザーの手
		String userHand = request.getParameter("hand"); //Top.jsp => name="hand"
		//userHand(String型)をintUserHand(int型)にキャスト
		int intUserHand = Integer.parseInt(userHand);
		
		//コンピュータの手
		int pcHand = new Random().nextInt(3);
//		System.out.print(judge[intUserHand][pcHand]);
		
		
		
		//じゃんけんの勝敗判定
		String judge1;
		String judge2;
		//あいこ
		if(intUserHand==pcHand) {
			judge1 = "残念！";
			judge2 = "あいこです。";
		//勝ち
		} else if((intUserHand==0 && pcHand==1)
				||(intUserHand==1 && pcHand==2)
				||(intUserHand==2 && pcHand==0)){
			judge1 = "おめでとうございます！";
			judge2 = "あなたの勝ちです。";
		//負け
		} else {
			judge1 = "残念！";
			judge2 = "あなたの負けです。";
		}
		request.setAttribute("judge1", judge1);
		request.setAttribute("judge2", judge2);
		
		
		/*出した手と画像の名前を保存 */
		final String rock_img = "RPS_Rock.png";
		final String scissors_img = "RPS_Scissors.png";
		final String paper_img = "RPS_Paper.png";
		
		//ユーザーの手と画像の組み合わせをリクエストスコープに保存
		switch(intUserHand) {
		case 0://ユーザーがグーの時
			request.setAttribute("userHand", "グー");
			request.setAttribute("userHandImage", "RPS_Rock.png");
			break;
		case 1://ユーザーがチョキの時
			request.setAttribute("userHand", "チョキ");
			request.setAttribute("userHandImage", "RPS_Scissors.png");
			break;
		case 2://ユーザーがパーの時
			request.setAttribute("userHand", "パー");
			request.setAttribute("userHandImage", "RPS_Paper.png");
			break;
		}
		
		//コンピュータの手と画像の組み合わせをリクエストスコープに保存
		switch(pcHand) {
		case 0://ユーザーがグーの時
			request.setAttribute("pcHand", "グー");
			request.setAttribute("pcHandImage", "RPS_Rock.png");
			break;
		case 1://ユーザーがチョキの時
			request.setAttribute("pcHand", "チョキ");
			request.setAttribute("pcHandImage", "RPS_Scissors.png");
			break;
		case 2://ユーザーがパーの時
			request.setAttribute("pcHand", "パー");
			request.setAttribute("pcHandImage", "RPS_Paper.png");
			break;
		}
		
		
		doGet(request, response);
	}

	
}
