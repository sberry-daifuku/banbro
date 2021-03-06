package banbro.model.bdx;

public enum VibratoShape {
	// 00:なし 01:sin 02:矩形 03:逆のこぎり 04:のこぎり 05:ランダム
	SIN(0x01, "サイン"),
	RECTANGLAR(0x02, "矩形"),
	SAWTOOTH(0x03, "ノコギリ"),
	REVERSE_SAWTOOTH(0x04, "逆ノコギリ"),
	RANDOM(0x05, "ランダム"),
	NONE(0x00, "なし");
	
	private int _value;
	private String _name;
	private VibratoShape(int value, String name) {
		_value = value;
		_name = name;
	}
	public int getValue() {
		return _value;
	}
	public String getShapeName() {
		return _name;
	}
	public static VibratoShape valueOf(int value) {
		for (VibratoShape shape : values()) {
			if (shape.getValue()==value) {
				return shape;
			}
		}
		return NONE;
	}

}
