private class NetWorkAsycTask extends AsycTask<URL ,Void, Integer >{

    protected Void doInBackGround(URL ... url){
        //declare the string and data types to be used
        int count = url.length;
        Long totalCount = 0;
        //loop through each array og URLs using for loop
        for(int i = 0; i<count; i++)
        {
            totalCount += Downloader.DownloadFile(url[i]);
            //show the progress of file being downloaded by the user
            publishProgress((int) ((i) count)*100);
            //if the user cancels the process, then quit the process
            if(isCancelled)
            {
                break;
            }
            return totalCount;
        }      
    }
    // update the UI while the progress is updating on the background Async
    protected Void onProgressUpdate(Integer ... progress)
    {
        setProgressPercentage([0]);
    }
    //Noe update the UI once the data is done fetching in background
    protected void onPostExecute(Long result)
    {
        showDialog("Downloaded" + result + "bytes");
    }
}
