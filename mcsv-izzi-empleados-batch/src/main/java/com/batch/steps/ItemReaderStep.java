package com.batch.steps;


import com.batch.entities.Empleados;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ItemReaderStep implements Tasklet {

    @Autowired
    private ResourceLoader resourceLoader;


    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {

        log.info("-------------------> Inicio del paso de lectura del archivo <-------------------");

        // Crear un objeto CSVReaderBuilderWithSeparator y especificar el separador como coma
        Reader reader = new FileReader(resourceLoader.getResource("classpath:files/destino/empleados.csv").getFile());
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .build();

        CSVReader csvReader = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .withSkipLines(1)   // Ignorar la primera línea como encabezado
                .build();

        // Leer cada línea del archivo CSV y convertirla a un objeto Persona
        List<Empleados> personList = new ArrayList<>();

        String[] linea;
        while ((linea = csvReader.readNext()) != null) {
            Empleados person = new Empleados();
            person.setIdSSFF(Long.parseLong(linea[0]));
            person.setDescMotvo(linea[1]);
            person.setIdSubmotivo(linea[2]);
            person.setDescSubMotvo(linea[3]);
            person.setNombre(linea[4]);
            person.setAPaterno(linea[5]);
            person.setAMaterno(linea[6]);
            person.setFechaNac(linea[7]);
            person.setGenero(linea[8]);
            person.setCurpNac(linea[9]);
            person.setIdRazonSocial(Integer.parseInt(linea[10]));
            person.setRazonSocial(linea[11]);
            person.setNumEmplLab(Integer.parseInt(linea[12]));
            person.setIdCodPuesto(Integer.parseInt(linea[13]));
            person.setCodPuesto(linea[14]);
            person.setCiaOutsourcing(linea[15]);
            person.setEstatus(linea[16]);
            person.setFecIngreso(linea[17]);
            person.setIdPlaza(linea[18]);
            person.setDescPlaza(linea[19]);
            person.setSubNvlFuncional(linea[20]);
            person.setCveRegion(Integer.parseInt(linea[21]));
            person.setRegion(linea[22]);
            person.setIdDepto(Integer.parseInt(linea[23]));
            person.setIdCtoTbjo(Integer.parseInt(linea[24]));
            person.setCtoTrabajo(linea[25]);
            person.setTpoEmpleo(linea[26]);
            person.setNvlFuncional(linea[27]);
            person.setClaseEmpleado(linea[28]);
            person.setIdSsffJI(Integer.parseInt(linea[29]));
            person.setNomEmplJI(linea[30]);
            person.setEmailJI(linea[31]);
            personList.add(person);
        }

        // Cerrar el objeto CSVReader y el archivo
        csvReader.close();
        reader.close();

        chunkContext.getStepContext()
                .getStepExecution()
                .getJobExecution()
                .getExecutionContext()
                .put("personList", personList);

        log.info("-------------------> Fin del paso de lectura del archivo <-------------------");

        return RepeatStatus.FINISHED;

    }
}
