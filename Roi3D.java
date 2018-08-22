/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NDL_Plugins;

import ij.ImagePlus;
import ij.gui.Roi;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Balaji
 */
public class Roi3D {
        
    TreeMap<Integer,Roi>  rois; //Tree map datastructure for storing a collection of regular ImageJ Rois. 
                                // If the tree contains the rois about the same center but in different slices we might consider it as 
                                // 3D ROI. The reuirement of same XY center is only suggestive but not enforced/expected.
                                // The slice number is used as a key and it is mapped to a 2D roi in that slice.
    
    int nSlices ;               //the thickness span of the 3D ROI epxressed in number image slices
    
    int centerX, centerY, centerZ; //Stores the 3D roi's center
    
    private String Name;
    
    /**
     * Function to fetch the 2D roi that is part of this 3D set and mapped to the slice number.
     * If there is no entry for the slice number the function will return null. This behavior is the reflection of the get method in 
     * collections framework of Java. 
     * @param slice the slice number for which the 2D ROi is requested for. Internally it is used as a key to fetch the Roi. 
     * @return : returns the 2D roi present in slice 
     */
    public final Roi get2DRoi(int slice){
               return rois.get(slice);
    }
    
    public Roi3D() {
        
        this.rois = new TreeMap<Integer,Roi>();
        nSlices = 0;
        centerX = 0;
        centerY = 0;
        centerY = 0;
    }
    public Roi3D(int no_of_slices){
        
        this.rois = new TreeMap<Integer,Roi>();
        nSlices = no_of_slices;
        centerX = 0;
        centerY = 0;
        centerY = 0;
    }
    public Roi3D(Roi[] rois){
        
        this.rois = new TreeMap<Integer,Roi>();
        nSlices = 0;
        centerX = 0;
        centerY = 0;
        centerY = 0;
        
        for(Roi roi:rois){
            this.rois.put(roi.getZPosition(), roi);
        }
        nSlices = this.rois.firstKey()-this.rois.lastKey();
    }
    public int getStartSlice(){
        return rois.firstKey();
    }
    public int getEndSlice(){
        return rois.lastKey();
    }
    public int getThickness() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return nSlices;
    }
    
    /**
     * This function iteratively compares the center of mass of roi with that of the geometric center (centroid) if the difference is more than
     * the threshold (limit) then moves the center of the roi (and hence the centroid ) to that of center of mass. This is done until the difference 
     * converges to less than than the set threshold.
     *
     * @param imp : It takes in the imageplus on which the rois need to be centered.
     * @return status : it returns if the recentering was sucessfull (ie did it converge).
     */
    public boolean Recenter(ImagePlus imp){
                                //yet to implement. 
        return false;
    }
    /**
     * 
     * @param roi
     * @param nSlice
     * @return nSlice : returns the slice number corresponding to the roi or -1 in the event where the addition is not successful. 
     */
    public boolean addRoi(Roi roi, int nSlice){
        roi.setPosition(nSlice);
        return addRoi(roi);
        //return -1;
    }
    /**
     * 
     * @param roi
     * @return Error Status: returns true if the error /exception occurred during addition of roi
     */
    public boolean addRoi(Roi roi) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      boolean error = false;
        try{
            rois.put(roi.getPosition(), roi);
       }catch( Exception E){
            error = true;
       }
       return error;     //returns true if there is an error and the roi could not be added.
   }

    /**
     *
     * @param roiset
     * @return Error Status: True means error has occurred
     */
    public boolean addRoiSet(Roi[] roiset){
       boolean status = false;
       for(Roi roi : roiset){
         status = addRoi(roi);  
       }
       return status;
   }
    /**
     * 
     * @param roiset
     * @param nSlice
     * @return Error status: True means error has occurred
     */
    public boolean addRoiSet(Roi[] roiset, int [] nSlice){
        boolean status = false;
        if(roiset.length != nSlice.length){
            //Erroroneous call we need to have the smae number of slice numbers as the rois
            //ToDo: Implement throwins an error message or exception
            return true;
        }
        int count = 0;
        for(Roi roi: roiset)
            status = addRoi(roi,nSlice[count++]);  
        return status;
   }
    /**
     * 
     * @param nSlice
     * @return 
     */
    public Roi getRoi(int nSlice){
        return this.rois.get(nSlice);
    }
    /**
     * 
     * @return :Returns the set of 2D rois that constitute this 3D roi.
     */
    public Roi [] getRoiSet(){
        Roi [] roiArray = new Roi[rois.size()];
        Set roiSet = rois.entrySet();
        Iterator it = roiSet.iterator();
        int count = 0;
        while(it.hasNext()){
            Map.Entry roiEntry = (Map.Entry)it.next();
            roiArray[count++] = (Roi) roiEntry.getValue();
        }
        return roiArray;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
