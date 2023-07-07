package hang_study;

public interface Menu {
    //작성된 메뉴 출력 기능
    public String[] printMenu();
    // 사용자 입력 기능
    public int inputNum();
    // 입렵된 값에 따라 메뉴 출력
    public void enterMenu(int menu, String [] items);
    // 아무거나 AI 추천 메뉴 출력
    public void aiPrintMenu(Strubg [] int);
}
