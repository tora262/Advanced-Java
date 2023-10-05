package baitap;

public class TreeNodeController {
    public static void main(String[] args) {
        TreeNodeService<Integer> treeNodeService = new TreeNodeService<>(
                new TreeNode<>(60)
        );

        treeNodeService.expandLeft(55);
        treeNodeService.expandRight(100);

        System.out.println(
                treeNodeService.search(100) ? "Cây có tồn tại giá trị tìm kiếm" : "Cây không tồn tại giá trị tìm kiếm"
        );

    }
}
