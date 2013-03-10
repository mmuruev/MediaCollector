package org.mediacollector.filesystem.collections.node;

import org.apache.commons.vfs2.FileObject;
import org.mediacollector.filesystem.interfaces.node.IMediaNode;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: mf
 * Date: 29.05.12
 * Time: 15:23
 * The Class is implementing a collection node
 */
public class CMediaNode implements IMediaNode
{
    Map<String, FileObject> mediaFiles;
    Map<String, FileObject> subtitles;
    Map<String, FileObject> descriptions;
    Map<String, FileObject> covers;

    public CMediaNode()
    {
        mediaFiles = new HashMap<>();
        subtitles = new HashMap<>();
        descriptions = new HashMap<>();
        covers = new HashMap<>();
    }

    /**
     * Set media file in this unit
     *
     * @param mediaFile object mediafile
     */
    @Override
    public void setMediaFile(FileObject mediaFile)
    {
        mediaFiles.put(mediaFile.getName().getBaseName(), mediaFile);
    }

    /**
     * Set subtitle file in this unit
     *
     * @param subtitleFile subtitle object
     */
    @Override
    public void setSubtitleFile(FileObject subtitleFile)
    {
       subtitles.put(subtitleFile.getName().getBaseName(), subtitleFile);
    }

    /**
     * Set describe file in this unit
     *
     * @param describeFile describe object
     */
    @Override
    public void setDescribeFile(FileObject describeFile)
    {
        descriptions.put(describeFile.getName().getBaseName(), describeFile);
    }

    /**
     * Set cover file in this unit
     *
     * @param coverFile cover file object
     */
    @Override
    public void setCoverFile(FileObject coverFile)
    {
        covers.put(coverFile.getName().getBaseName(), coverFile);
    }

    /**
     * Get all media files from this node
     *
     * @return media files collection
     */
    @Override
    public Map<String, FileObject> getMediaFiles()
    {
        return mediaFiles;
    }

    /**
     * Get all subtitles from this node
     *
     * @return subtitle files collection
     */
    @Override
    public Map<String, FileObject> getSubtitleFiles()
    {
        return subtitles;
    }
    /**
     * Get all describe files from this node
     *
     * @return describe files collection
     */
    @Override
    public Map<String, FileObject> getDescribeFiles()
    {
        return descriptions;
    }

    /**
     * Get all covers from this node
     *
     * @return cover files collection
     */
    @Override
    public Map<String, FileObject> getCoverFiles()
    {
        return covers;
    }
}
