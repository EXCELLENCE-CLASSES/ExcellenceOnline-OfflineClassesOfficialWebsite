package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
class DownloadManager2ApplicationTests {
	
	@Autowired
	private ExcellenceDocumentRepository repo; 
	
	@Autowired
	private TestEntityManager entityManager ;

	@Test
	@Rollback(false)
	void testInsertDocument() {
		File file=new File("C:\\Users\\Ritesh\\Documents\\MyDocument\\xyz.txt");
		ExcellenceDocument exc=new ExcellenceDocument();
		exc.setName(file.getName());
		
		try {
			byte[] bytes=Files.readAllBytes(file.toPath());
			exc.setContent(bytes);
			long fileSize=bytes.length;
			exc.setSize(fileSize);
			exc.setUploadTime(new Date());
			ExcellenceDocument savDoc=repo.save(exc);
			ExcellenceDocument existDoc=entityManager.find(ExcellenceDocument.class, savDoc.getId());
			assertThat(existDoc.getSize()).isEqualTo(fileSize);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
