package ma.cigma.javaZoom.threeTier.service;

import ma.cigma.javaZoom.threeTier.doa.StudentDao;
import ma.cigma.javaZoom.threeTier.doa.StudentDaoImpl;
import ma.cigma.javaZoom.threeTier.presentation.model.Student;

/**
 * Created by Oussama_Qaiboub on 2020-12-29.
 */
public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public void save(Student s) {

        studentDao.insert(s);
    }
}
