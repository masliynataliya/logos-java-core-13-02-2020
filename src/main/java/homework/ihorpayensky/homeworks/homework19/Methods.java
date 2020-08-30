package homework.ihorpayensky.homeworks.homework19;

import java.io.*;

class Methods {

    public static void Serializable(Serializable obj, File file) throws IOException {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(obj);
        os.close();
    }

    public static Serializable Deserializable(File file) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        return (Serializable) ois.readObject();
    }

}
