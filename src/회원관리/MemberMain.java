package 회원관리;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== 회원 관리 시스템 ===");
            System.out.println("\n[1]회원가입 [2]로그인 [3]전체회원조회 [4]회원삭제 [5]총 회원수 [6]종료");
            System.out.print("선택 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("아이디 : ");
                    String id = sc.next();
                    boolean isDuplicate = false;
                    for (Member member : members) {
                        if (member.getId().equals(id)) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (isDuplicate) {
                        System.out.println("이미 사용 중인 아이디입니다.");
                    } else {
                        System.out.print("이름 : ");
                        String name = sc.next();
                        System.out.print("비밀번호 : ");
                        String pw = sc.next();
                        System.out.print("나이 : ");
                        int age = sc.nextInt();
                        members.add(new Member(name, id, pw, age));
                        System.out.println("→ [" + members.size() + "번] " + id + " 님, 회원가입이 완료되었습니다.");
                    }
                    break;
                case 2:
                    System.out.print("아이디 : ");
                    String loginId = sc.next();
                    Member loginUser = null;
                    for (Member member : members) {
                        if (member.getId().equals(loginId)) {
                            loginUser = member;
                            break;
                        }
                    }
                    if (loginUser == null) {
                        System.out.println("→ 존재하지 않는 아이디입니다.");
                    } else {
                        System.out.print("비밀번호 : ");
                        String loginPw = sc.next();
                        if (loginUser.getPw().equals(loginPw)) {
                            System.out.println("→ 로그인 성공! 환영합니다, " + loginUser.getName() + " 님");
                            boolean isLogout = false;
                            while (!isLogout) {
                                System.out.println("\n[1]회원가입 [2]로그인 [3]전체회원조회 [4]회원삭제 [5]총 회원수 [6]종료");
                                System.out.print("선택 : ");
                                int subMenu = sc.nextInt();
                                switch (subMenu) {
                                    case 1:
                                        loginUser.printInfo();
                                        break;
                                    case 2:
                                        System.out.print("이름 입력 (현재: " + loginUser.getName() + ") : ");
                                        loginUser.setName(sc.next());
                                        System.out.print("나이 입력 (현재: " + loginUser.getAge() + ") : ");
                                        loginUser.setAge(sc.nextInt());
                                        System.out.println("→ 회원 정보가 수정되었습니다.");
                                        break;
                                    case 3:
                                        System.out.print("현재 비밀번호 확인 : ");
                                        if (sc.next().equals(loginUser.getPw())) {
                                            System.out.print("새 비밀번호 : ");
                                            loginUser.setPw(sc.next());
                                            System.out.println("→ 비밀번호가 변경되었습니다.");
                                        } else {
                                            System.out.println("→ 비밀번호가 일치하지 않습니다.");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("→ 로그아웃 되었습니다.");
                                        isLogout = true;
                                        break;
                                }
                            }
                        } else {
                            System.out.println("→ 비밀번호가 틀렸습니다.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("=== 전체 회원 목록 ===");
                    if (members.isEmpty()) {
                        System.out.println("→ 등록된 회원이 없습니다.");
                    } else {
                        for (Member member : members) {
                            member.printInfo();
                        }
                    }
                    break;
                case 4:
                    System.out.print("삭제할 아이디 : ");
                    String delId = sc.next();
                    boolean isRemoved = false;
                    for (int i = 0; i < members.size(); i++) {
                        if (members.get(i).getId().equals(delId)) {
                            System.out.print("정말 삭제하시겠습니까? [yes/no] : ");
                            String confirm = sc.next();
                            if (confirm.equalsIgnoreCase("yes")) {
                                members.remove(i);
                                Member.decreaseCount();
                                System.out.println("→ " + delId + " 님의 정보가 삭제되었습니다.");
                                isRemoved = true;
                            } else {
                                System.out.println("→ 삭제가 취소되었습니다.");
                                isRemoved = true;
                            }
                            break;
                        }
                    }
                    if (!isRemoved) {
                        System.out.println("→ 존재하지 않는 아이디입니다.");
                    }
                    break;
                case 5:
                    System.out.println("→ 현재 총 회원 수는 " + Member.getTotalCount() + "명입니다.");
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }
}
