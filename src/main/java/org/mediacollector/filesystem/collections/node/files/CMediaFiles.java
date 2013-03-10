package org.mediacollector.filesystem.collections.node.files;

import org.apache.commons.vfs2.FileObject;
import org.mediacollector.filesystem.interfaces.node.files.IMediaFileCollection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: mf
 * Date: 29.05.12
 * Time: 20:23
 * The Class is implementing media file collection
 */
public class CMediaFiles implements IMediaFileCollection
{
    private final Map<String, FileObject> mediaFiles;

    public CMediaFiles()
    {
        mediaFiles = new HashMap<>();
    }

    /**
     * Get element from collection by name
     *
     * @param sNameMediaFile name of element
     * @return FileObject element
     */
    @Override
    public FileObject get(String sNameMediaFile)
    {
        return mediaFiles.get(sNameMediaFile);
    }

    /**
     * Replace collection on the new one
     *
     * @param mediaCollection new collection of media files
     */
    @Override
    public void putAll(IMediaFileCollection mediaCollection)
    {
        mediaFiles.clear();


        //mediaFiles.putAll();
    }

    /**
     * Put new element in collection
     *
     * @param media new element of media file
     */
    @Override
    public void put(FileObject media)
    {
        mediaFiles.put(media.getName().getBaseName(), media);
    }

    /**
     * Remove element from collection by name
     *
     * @param sNameMediaFile string with name element for remove
     */
    @Override
    public void remove(String sNameMediaFile)
    {
        mediaFiles.remove(sNameMediaFile);
    }
}
