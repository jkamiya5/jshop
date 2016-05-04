package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import main.entity.Users;
import main.repositories.UserDataRepository;

@SpringBootApplication
public class Main {

	@Autowired
	UserDataRepository repository;

	public static void main(String[] args) {

		// 初回起動で一番最初に呼ばれるやつ？？
		ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args);
		Main m = ctx.getBean(Main.class);

		// このタイミングでデータを登録しようとしている
		m.dataImportByJpa();
		m.dataImportBySql();

	}

	/**
	 * ここでデータを登録したい（sqlファイルを使用の場合）
	 */
	private void dataImportBySql() {

		// STSプロジェクト内にある「data.sql」を読み込んで実行したい

	}

	/**
	 * ここでデータを登録したい（JPAを使用の場合）
	 */
	private void dataImportByJpa() {

		// UserDataエンティティ
		Users data = new Users();

		data.setUsername("user");
		data.setPassword("password");
		data.setEnabled(true);

		// 保存
		repository.saveAndFlush(data);

	}
}
