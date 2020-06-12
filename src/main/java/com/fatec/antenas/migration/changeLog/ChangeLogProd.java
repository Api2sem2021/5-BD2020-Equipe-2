package com.fatec.antenas.migration.changeLog;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.fatec.antenas.model.DocumentEmpresario;
import com.fatec.antenas.repository.EmpresarioRepository;
import com.fatec.antenas.util.PasswordEncrypt;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

@ChangeLog
public class ChangeLogProd {
	
	  @Profile("prod")
	  @ChangeSet(order = "001", id = "emp_default_admin", author = "prod", systemVersion = "prod:0.0.1")
	  public void cadInitEmpresarioAdminProd(MongoTemplate mongoTemplate){
		  DocumentEmpresario empresarioAdmin = new DocumentEmpresario(null, "admin",
					 "admin.empresario@fatec.sp.gov.br", new PasswordEncrypt("admin").getPasswordEncoder(), "FATEC", "008.678.770-57", "");
			 empresarioAdmin.setAdmin(true);
			 empresarioAdmin.setAtivo(true);
			 mongoTemplate.save(empresarioAdmin);
	  }


}
