package service;

import dao.FileDAO;

// Service layer – business logic
public class FileService {

    FileDAO dao = new FileDAO();

    public boolean createFile() {
        return dao.createFile();
    }

    public boolean writeFile(String text) {
        return dao.writeFile(text);
    }

    public void readFile() {
        dao.readFile();
    }

    public boolean updateFile(String text) {
        return dao.updateFile(text);
    }
}
