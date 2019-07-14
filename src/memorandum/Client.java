package memorandum;

public class Client {
    public static void main(String[] args){
        NiuNiu nn = new NiuNiu();

        //创建相册
        AlbumCareTaker album = new AlbumCareTaker();

        //将备忘放入相册
        nn.grow();
        album.add("1",nn.takePhoto());
        nn.grow();
        album.add("2",nn.takePhoto());

        //从相册中取出备忘
        IMemento im = album.findIMemonto("1");
        nn.restorePhotoState(im);

        im = album.findIMemonto("2");
        nn.restorePhotoState(im);

    }
}
