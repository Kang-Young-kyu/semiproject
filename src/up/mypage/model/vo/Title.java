package up.mypage.model.vo;

import java.io.Serializable;

//Ÿ��Ʋ 
public class Title implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 225237288261572118L;

	// Ÿ��Ʋ �ڵ�
	private int tCode;

	// Ÿ��Ʋ ��
	private String tName;

	// Ÿ��Ʋ �ڸ�Ʈ
	private String tComment;

	// Ÿ��Ʋ ����
	private String tCondition;
	
	
	public Title() {
		// TODO Auto-generated constructor stub
	}
	

	public Title(int tCode, String tName, String tComment, String tCondition) {
		super();
		this.tCode = tCode;
		this.tName = tName;
		this.tComment = tComment;
		this.tCondition = tCondition;
	}


	public int getTCode() {
		return tCode;
	}

	public void setTCode(int tCode) {
		this.tCode = tCode;
	}

	public String getTName() {
		return tName;
	}

	public void setTName(String tName) {
		this.tName = tName;
	}

	public String getTComment() {
		return tComment;
	}

	public void setTComment(String tComment) {
		this.tComment = tComment;
	}

	public String getTCondition() {
		return tCondition;
	}

	public void setTCondition(String tCondition) {
		this.tCondition = tCondition;
	}


	@Override
	public String toString() {
		return "Title [tCode=" + tCode + ", tName=" + tName + ", tComment=" + tComment + ", tCondition=" + tCondition
				+ "]";
	}

	
	
}