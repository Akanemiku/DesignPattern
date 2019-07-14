package memorandum;

public class NiuNiu {
    private PhotoState state;

    public NiuNiu() {
        state = new PhotoState();
    }

    public void grow() {
        state.setLength(state.getLength() + 5);
    }

    //内部私有类
    private class PhotoMemento implements IMemento {
        private PhotoState s;

        public PhotoMemento(PhotoState state) {
            this.s = state;
        }

        public PhotoState getPhotoState() {
            return s;
        }

        public void setPhotoState(PhotoState state) {
            this.s = state;
        }
    }

    //进行照相，返回备忘对象
    public IMemento takePhoto() {
        //设置临时state让相册储存防止储存同一个state在状态更改后出现错误
        PhotoState p = new PhotoState();
        p.setLength(state.getLength());
        return new PhotoMemento(p);
    }

    //将备忘对象取出
    public void restorePhotoState(IMemento m) {
        PhotoMemento gm = (PhotoMemento) m;
        this.state = gm.getPhotoState();
        System.out.println("牛牛的身高：" + state.getLength());
    }


}
