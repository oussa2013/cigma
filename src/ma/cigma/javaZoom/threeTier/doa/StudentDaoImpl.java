package ma.cigma.javaZoom.threeTier.doa;

import ma.cigma.javaZoom.threeTier.presentation.model.Student;

/**
 * Created by Oussama_Qaiboub on 2020-12-29.
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public void insert(Student s) {

        System.out.println("saved name :" + s.getFirstName() + " age : "+ s.getAge());
    }
}
