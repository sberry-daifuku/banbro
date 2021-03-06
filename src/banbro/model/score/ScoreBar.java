package banbro.model.score;

/**
 * 小節線
 * @see BarType
 */
public class ScoreBar implements Score {

	private BarType _type;
	private int _measureNum;

	/**
	 * {@link BarType#SINGLE}の小節線
	 */
	public ScoreBar() {
		this(BarType.SINGLE);
	}

	public ScoreBar(BarType type) {
		_type = type;
		_measureNum = -1;
	}

	public void setType(BarType type) {
		_type = type;
	}

	public BarType getType() {
		return _type;
	}

	/**
	 * @param num 小節番号 楽譜の先頭の小節番号は0
	 */
	public void setMeasureNum(int num) {
		if (num<0) {
			throw new IllegalArgumentException();
		}
		_measureNum = num;
	}

	/**
	 * @return 小節番号 未設定の場合は-1を返す
	 */
	public int getMeasureNum() {
		return _measureNum;
	}


}
