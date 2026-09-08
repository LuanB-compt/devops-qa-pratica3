# teste-unidade-3_IJ

Projeto Maven preparado para IntelliJ IDEA.

- Java 17
- JUnit 5 (Jupiter) 5.11.4
- Spring Boot
- JaCoCo 0.8.12

## Abrir no IntelliJ
Abra a pasta `teste-unidade-3_IJ` ou selecione o arquivo `pom.xml`.

## Executar testes
```bash
./mvnw test
```

No Windows PowerShell:
```powershell
.\mvnw.cmd test
```

## Gerar relatório JaCoCo
```bash
./mvnw clean verify
```

O relatório HTML será gerado em `target/site/jacoco/index.html`.
