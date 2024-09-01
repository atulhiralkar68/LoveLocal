/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package generic;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Hp
 * @param key
 * @return value
 * @throws Throwable
 */
public class PropertyFileReader {

    public static String getValueProperty(String key) throws Throwable {

        FileInputStream file = new FileInputStream(FrameworkConstant.PROPERTIES_PATH);
        Properties properties = new Properties();
        properties.load(file);
        return properties.getProperty(key);

    }
}
