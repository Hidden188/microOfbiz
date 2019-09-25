package com.June17;

public class work0 {

	public static void determine(String files[]) {
		for (int i = 0; i < files.length; i++) {
			for (int j = i + 1; j < files.length; j++) {
				if (Long.valueOf(files[i].substring(14, 27)) > Long.valueOf(files[j].substring(14, 27))) {
					StringBuffer buffer = new StringBuffer();
					buffer.append(files[i]).append(files[j]);
					files[i] = buffer.toString().substring(files[i].length());
					files[j] = buffer.toString().substring(0, files[i].length());
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] files = new String[10];
		files[0] = "ZiZaitianyuan_20160617221245";
		files[1] = "ZiZaitianyuan_20160617220245";
		files[2] = "ZiZaitianyuan_20160627221245";
		files[3] = "ZiZaitianyuan_20160417221245";
		files[4] = "ZiZaitianyuan_20160217221245";
		files[5] = "ZiZaitianyuan_20160817221245";
		files[6] = "ZiZaitianyuan_20160617121245";
		files[7] = "ZiZaitianyuan_20160617201245";
		files[8] = "ZiZaitianyuan_20160617221255";
		files[9] = "ZiZaitianyuan_20160617221225";
		determine(files);
		for (String i : files) {
			System.out.println(i);
		}
	}
}
