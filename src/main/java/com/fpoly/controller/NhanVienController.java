package com.fpoly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.fpoly.model.NhanVienModel;
import com.fpoly.service.NhanVienService;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {

    NhanVienService nvser;

    public NhanVienController(NhanVienService nv) {
        this.nvser = nv;
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("content", "view/listnv.html");
        model.addAttribute("list", nvser.getAllNhanVien());
        return "layout/base.html";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("nhanvien", new NhanVienModel());
        return "view/formnv.html";
    }

    @PostMapping("/add")
    public String addNhanVien(@ModelAttribute("nhanvien") NhanVienModel nv) {
        nvser.save(nv);
        return "redirect:/nhanvien/list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable("id") int id, Model model) {
        NhanVienModel nv = nvser.getById(id);
        model.addAttribute("content", "view/editnv.html");
        model.addAttribute("nhanvien", nv);
        return "layout/base.html";
    }

    @PostMapping("/update")
    public String updateNhanVien(@ModelAttribute("nhanvien") NhanVienModel nv) {
        nvser.save(nv);
        return "redirect:/nhanvien/list";
    }
}
