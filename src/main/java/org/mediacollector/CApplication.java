package org.mediacollector;

import org.apache.commons.vfs2.FileObject;
import org.mediacollector.filesystem.CScanner;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mf
 * Date: 27.02.12
 * Time: 2:00
 * To change this template use File | Settings | File Templates.
 */
public class CApplication
{
    public static void main(String[] args)
    {
        System.out.print("User Directory path ");
        CScanner scanner = new CScanner("/home/mf/Видео");
        List<List> result= scanner.getTree();
        int count = 0;
        for(List list: result){
            count++;

            System.out.println(count+". \"" + list + "\"");

        }
    }
}
