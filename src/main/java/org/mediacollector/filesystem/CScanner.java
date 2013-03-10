package org.mediacollector.filesystem;

import org.apache.commons.vfs2.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mf
 * Date: 27.02.12
 * Time: 2:34
 * To change this template use File | Settings | File Templates.
 */
public class CScanner
{
    private String basePath;

    public CScanner(String basePath)
    {
        this.basePath = basePath;
    }

    public List<List> getTree()
    {
        //Collection<File>  files = FileUtils.listFiles(new File("/home/mf/public_html/aRh"), new SuffixFileFilter(""), DirectoryFileFilter.DIRECTORY);
        //StringBuilder filesTree = new StringBuilder();
        FileObject file = null;
        try
        {
            FileSystemManager fsManager = VFS.getManager();
            file = fsManager.resolveFile(basePath);
            //findFiles( new FileTypeSelector( FileType.FOLDER ) ) ;
        } catch (FileSystemException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        /*     for(FileObject file:files)
        {
            try {
                file.getChildren();
            } catch (FileSystemException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            filesTree.append(file.getName().getBaseName() + "\n");
        }*/
        List<List> result = getAllChildren(file);
        return result;
    }

    private List<List> getAllChildren(FileObject aRootObject)
    {
        // List<FileObject>  rootList = null;
        List<FileObject> aRootObjects = null;
        try
        {
            aRootObjects = Arrays.asList(aRootObject.getChildren());
        } catch (FileSystemException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        //StringBuilder filesTree = new StringBuilder();
        List<List> filesList = new LinkedList<>();

        for (FileObject rootObject : aRootObjects)
        {
            try
            {
                if (rootObject.getType() == FileType.FOLDER)
                {
                    filesList.add(getAllChildren(rootObject));
                } else
                {
                    List<FileObject> oneElement = new LinkedList<>();
                    oneElement.add(rootObject);
                    filesList.add(oneElement);
                }
            } catch (FileSystemException e)
            {
                e.printStackTrace();
            }
        }
        return filesList;
    }
}
